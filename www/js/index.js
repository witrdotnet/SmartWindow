
$(document).on("pageshow", "#home", function() {
	setTimeout(function() {
		$.mobile.navigate( "#waitForBeacon", { transition : "fade", info: "info about the #waitForBeacon hash" });
	}, 5000);
});

$(document).on("pageshow", "#waitForBeacon", function() {
	$( "#waitForBeacon" ).on( "tap", function() {
		$.mobile.navigate( "#loadFromBeacon", { transition : "fade", info: "info about the #loadFromBeacon hash" });
	});

	$(".btnexit").on("tap", function(e){
		$.mobile.navigate( "#bye", { transition : "fade", info: "info about the #bye hash" });
		e.stopPropagation();
		return false;
	});
});

$(document).on("pageshow", "#loadFromBeacon", function() {
	setTimeout(function() {
		$.mobile.navigate( "#info1", { transition : "fade", info: "info about the #info1 hash" });
	}, 3000);
});

$(document).on("pageshow", "#info1", function() {
	$(".btnX").on("tap", function(e){
		$.mobile.navigate( "#bye", { transition : "fade", info: "info about the #bye hash" });
		e.stopPropagation();
		return false;
	});
	$( "#info1" ).on( "tap", function() {
		$.mobile.navigate( "#info2", { transition : "fade", info: "info about the #info2 hash" });
	});
});

$(document).on("pageshow", "#info2", function() {
	$(".btnX").on("tap", function(e){
		$.mobile.navigate( "#bye", { transition : "fade", info: "info about the #bye hash" });
		e.stopPropagation();
		return false;
	});
	$( "#info2" ).on( "tap", function() {
		$.mobile.navigate( "#info3", { transition : "fade", info: "info about the #info3 hash" });
	});
});

$(document).on("pageshow", "#info3", function() {
	$(".btnX").on("tap", function(e){
		$.mobile.navigate( "#bye", { transition : "fade", info: "info about the #bye hash" });
		e.stopPropagation();
		return false;
	});
	$( "#info3" ).on( "tap", function() {
		$.mobile.navigate( "#info4", { transition : "fade", info: "info about the #info4 hash" });
	});
});

$(document).on("pageshow", "#info4", function() {
	$(".btnX").on("tap", function(e){
		$.mobile.navigate( "#bye", { transition : "fade", info: "info about the #bye hash" });
		e.stopPropagation();
		return false;
	});
	$( "#info4" ).on( "tap", function() {
		$.mobile.navigate( "#endInfos", { transition : "fade", info: "info about the #endInfos hash" });
	});
});

$(document).on("pageshow", "#endInfos", function() {
	$(".btnYeah").on("tap", function(){
		$.mobile.navigate( "#waitForBeacon", { transition : "fade", info: "info about the #waitForBeacon hash" });
	});

	$(".btnNope").on("tap", function(e){
		$.mobile.navigate( "#bye", { transition : "fade", info: "info about the #bye hash" });
		e.stopPropagation();
		return false;
	});
});
