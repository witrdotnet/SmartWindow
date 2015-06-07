
$(document).on("pagecreate", "#home", function() {
	setTimeout(function() {
		$.mobile.navigate( "#waitForBeacon", { transition : "fade", info: "info about the #waitForBeacon hash" });
	}, 3000);
});

$(document).on("pagecreate", "#waitForBeacon", function() {
	$( "#waitForBeacon" ).on( "tap", function() {
		$.mobile.navigate( "#loadFromBeacon", { transition : "fade", info: "info about the #loadFromBeacon hash" });
	});

	$(".btnexit").on("tap", function(){
		navigator.app.exitApp(); 
	});
});

$(document).on("pagecreate", "#loadFromBeacon", function() {
	setTimeout(function() {
		$.mobile.navigate( "#info1", { transition : "fade", info: "info about the #info1 hash" });
	}, 3000);
});

$(document).on("pagecreate", "#info1", function() {
	$(".btnX").on("tap", function(){
		navigator.app.exitApp(); 
	});
	$( "#info1" ).on( "tap", function() {
		$.mobile.navigate( "#info2", { transition : "fade", info: "info about the #info2 hash" });
	});
});

$(document).on("pagecreate", "#info2", function() {
	$(".btnX").on("tap", function(){
		navigator.app.exitApp(); 
	});
	$( "#info2" ).on( "tap", function() {
		$.mobile.navigate( "#info3", { transition : "fade", info: "info about the #info3 hash" });
	});
});

$(document).on("pagecreate", "#info3", function() {
	$(".btnX").on("tap", function(){
		navigator.app.exitApp(); 
	});
	$( "#info3" ).on( "tap", function() {
		$.mobile.navigate( "#info4", { transition : "fade", info: "info about the #info4 hash" });
	});
});

$(document).on("pagecreate", "#info4", function() {
	$(".btnX").on("tap", function(){
		navigator.app.exitApp(); 
	});
	$( "#info4" ).on( "tap", function() {
		$.mobile.navigate( "#endInfos", { transition : "fade", info: "info about the #endInfos hash" });
	});
});

$(document).on("pagecreate", "#endInfos", function() {
	$(".btnYeah").on("tap", function(){
		$.mobile.navigate( "#waitForBeacon", { transition : "fade", info: "info about the #waitForBeacon hash" });
	});

	$(".btnNope").on("tap", function(){
		$.mobile.navigate( "#bye", { transition : "fade", info: "info about the #bye hash" });
	});
});
