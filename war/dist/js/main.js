	var mapBettings = new Object();
	var isLogged = $( "#isLogged" ).val();
	
	function viewAbout(){
		var messageText = '<p>projectPariSport is a proof of concept  of a paris sports site NBA created by <a href="https://github.com/xiajunt">Juntie XIA</a>, <a href="https://github.com/lionelseleucus">Lionel SELEUCUS</a>, and <a href="https://github.com/rmadiande">Rodier MADIANDE</a>.It was made for the teach unit "AAR" for 2nd year master students at Université Pierre et Marie Curie (aka Paris 6), in the Computer Science Master, speciality STL.</p>';
		messageText += '<br/> <br/>';
		messageText += '<p>';
		messageText += "# Functional specifications:<br/>"+
						"* Authentication via google email.<br/>"+
						"* Credits users 1000 tokens welcome, as it's still a game they are credited him with once again exhausted chips.<br/>"+
						"* List of NBA games for the pre-season, regular season and playoffs.<br/>"+
						"* Quotations are calculated according to the percentage of victories / defeats teams.<br/>"+
						"* Bet on one or more matches in choosing the winner.<br/>"+
						"* Ability to view the current paris.<br/>"+
						"* Sending mail to the user notifying them they have won or lost.<br/>";
		bootbox.dialog({
			  message: messageText,
			  title: "About",
			  buttons: {
			    danger: {
			      label: "Ok",
			      className: "btn-info",
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
	     var fName = $("<a href=''#' class='list-group-item'><span title='"+info+"'>"+teamNameSelected+"</span></a>");
	     fName.click(function() {
	        	delete mapBettings[gameId];
	            $(this).parent().remove();
	            if($.isEmptyObject(mapBettings)){
	            	obj.style.visibility="hidden";
	            }
	        });
	     if(mapBettings[gameId] != teamIdSelected ){
	    	 obj.style.visibility="visible";
	    	 mapBettings[gameId] = teamIdSelected;
	    	 fieldWrapper.append(fName);
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