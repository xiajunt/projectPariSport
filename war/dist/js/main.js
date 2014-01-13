	var mapBettings = new Object();
	var isLogged = "<%= (userService.getCurrentUser() == null)?false:true %>";
	
	function noImplementedYet(){
		bootbox.dialog({
			  message: "Not implemented yet",
			  title: "Warning",
			  buttons: {
			    danger: {
			      label: "Ok",
			      className: "btn-warning",
			      callback: function() {
			        //Example.show("uh oh, look out!");
			      }
			    }
			  }
			});
		
	}
		
	function addBet(gameId,teamIdSelected,teamNameSelected, info){
		 var obj = document.getElementById("betSelections");
		 var intId = $("#listBets div").length + 1;
		 
	     var fieldWrapper = $("<div class=\"fieldwrapper\" id=\"field" + intId + "\"/>");
	     var fName = $("<a href=''#' class='list-group-item'><span title='"+info+"'>"+teamNameSelected+"</span>");
	     var removeButton = $("<input type=\"button\" class=\"remove\" value=\"-\" />");
	        removeButton.click(function() {
	        	delete mapBettings[gameId];
	            $(this).parent().remove();
	            if($.isEmptyObject(mapBettings)){
	            	obj.style.visibility="hidden";
	            }
	        });
	     var fin = $("</a>");	        
	     if(mapBettings[gameId] != teamIdSelected ){
	    	 obj.style.visibility="visible";
	    	 mapBettings[gameId] = teamIdSelected;
	    	 fieldWrapper.append(fName);
	    	 fName.append(removeButton);
	    	 removeButton.append(fin);
		     $("#listBets").append(fieldWrapper);
	     }			
	}
	
	function sendBet(){
		var obj = document.getElementById("stake");
		if(isLogged == "false")
		{			
			bootbox.dialog({
				  message: "You must be logged in to place a bet!",
				  title: "Alert",
				  buttons: {
				    danger: {
				      label: "Ok",
				      className: "btn-danger",
				      callback: function() {
				        //Example.show("uh oh, look out!");
				      }
				    }
				  }
				});
			
		}else if(isNaN($("#stake").val()) || $("#stake").val()==""){
			bootbox.dialog({
				  message: "Only numbers are allowed",
				  title: "Alert",
				  buttons: {
				    danger: {
				      label: "Ok",
				      className: "btn-danger",
				      callback: function() {
				        //Example.show("uh oh, look out!");
				      }
				    }
				  }
				});
			
		}
		else
		{			
			if(($( "#token" ).val() - $( "#stake" ).val()) < 0){
				bootbox.dialog({
					  message: "Funds insuffifants",
					  title: "Alert",
					  buttons: {
					    danger: {
					      label: "Ok",
					      className: "btn-danger",
					      callback: function() {
					        //Example.show("uh oh, look out!");
					      }
					    }
					  }
					});
			}else{
				bootbox.confirm("Are you sure you confirm your bet ?", function(result) {
					 $.ajax({ 
	                     url:"/betting", 
	                     type:"POST", 
	                     data : { 
	                         'betting': JSON.stringify(mapBettings), 
	                         'userServiceNickName':encodeURI($( "#userServiceNickName" ).val()),
	                         'stake':encodeURI($( "#stake" ).val()),
	                         'userServiceEmail':encodeURI($( "#userServiceEmail" ).val()),
	                         'token':encodeURI($( "#token" ).val())
	                     },
	                     success: function(data) { 
	                    	 if (/true/.test(data)) {
	                    		 bootbox.dialog({
	           					  message: "The bet has been placed!",
	           					  title: "Info",
	           					  buttons: {
	           					    danger: {
	           					      label: "Ok",
	           					      className: "btn-info",
	           					      callback: function() {
	           					    	window.location.replace("/");
	           					      }
	           					    }
	           					  }
	           					});
	                    		 
	                    	 }else{
	                    		 bootbox.dialog({
	           					  message: "A problem occurred when the bet, please contact the technical service",
	           					  title: "Warning",
	           					  buttons: {
	           					    danger: {
	           					      label: "Ok",
	           					      className: "btn-warning",
	           					      callback: function() {
	           					        //Example.show("uh oh, look out!");
	           					      }
	           					    }
	           					  }
	           					});
	                    	 }
	                     },
	                     error: function(e) {
	                     	//alert(e.status);
	                     }
	                 });
				});
			}
		}
	}