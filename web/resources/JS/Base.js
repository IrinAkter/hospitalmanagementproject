var physicianHeight = 0;
var physicianSortAlpha;
var physicianSortExpertise;
var opportunitiesSort;

function base(){
	
	/* header and footer "|" dividers */
	$("div.header ul.nav li").after("<li class='divider'>|</li>");
	$("div.header ul.nav li:last").remove();
	
	/* google cse */
	$("div.header form#cse-search-box input#cse-search-box-go").hover(
		function () { $(this).addClass("button-hover"); }, 
		function () { $(this).removeClass("button-hover"); }
	);
	
	/* add active states to banners and remove sub menus */
	$("div#banner-about table td:nth-child(1)").addClass("active");
	$("div#banner-about table td:nth-child(1) div div").remove();
	
	$("div#banner-medical table td:nth-child(2)").addClass("active");
	$("div#banner-medical table td:nth-child(2) div div").remove();
	
	$("div#banner-patients table td:nth-child(3)").addClass("active");
	$("div#banner-patients table td:nth-child(3) div div").remove();
	
	$("div#banner-health table td:nth-child(4)").addClass("active");
	$("div#banner-health table td:nth-child(4) div div").remove();
	
	$("div#banner-center-childcare table td:nth-child(2)").addClass("active");
	$("div#banner-center-childcare table td:nth-child(2) div div").remove();
	
	$("div#banner-center-surgical table td:nth-child(2)").addClass("active");
	$("div#banner-center-surgical table td:nth-child(2) div div").remove();
	
	$("div#banner-center-joint table td:nth-child(2)").addClass("active");
	$("div#banner-center-joint table td:nth-child(2) div div").remove();
	
	$("div#banner-center-emergency table td:nth-child(2)").addClass("active");
	$("div#banner-center-emergency table td:nth-child(2) div div").remove();
	
	$("div#banner-center-aesthetic table td:nth-child(2)").addClass("active");
	$("div#banner-center-aesthetic table td:nth-child(2) div div").remove();
	
	/* slide down banners */
	$("div.banner table td").hover(
		function () { $(this).children("div").children("div").slideDown(250); }, 
		function () { $(this).children("div").children("div").slideUp(250); }
	);
	
	/* cms items */
	$(".cms-item:last").css({borderBottom:"none"});
	
	/******************************************************************************
	 physicians
	******************************************************************************/
	
		/* physicians list error messages */
		$("table.physicians-sort").after("<p class='error' id='error-alpha'>There are currently no doctors listed for this letter of the alphabet.</p><p class='error' id='error-expertise'>There are currently no doctors listed for this area of expertise.</p>");	
		
		/* physician list equal height */
		$("ul.physicians li").css({float:"left", width:"45%"});
		$("ul.physicians li").each(function(){
			if( $(this).height() > physicianHeight ){
				physicianHeight = $(this).height();
			}
		});
		$("ul.physicians li").height(physicianHeight);
		
		/* physician list filter */
		$("table.physicians-sort input#alpha-go").click(function(){
			$("table.physicians-sort select#expertise").children("option:first").attr("selected", true);
			physicianSortAlpha = $("select#alpha").val();
			$("p#error-alpha").hide();
			$("ul.physicians li").hide();
			$("ul.physicians li."+physicianSortAlpha).show();
			if($("ul.physicians li."+physicianSortAlpha).size()==0){
				$("p#error-alpha").show();
			}
		});
		$("table.physicians-sort input#expertise-go").click(function(){
			$("table.physicians-sort select#alpha").children("option:first").attr("selected", true);
			physicianSortExpertise = $("select#expertise").val();
			$("p#error-expertise").hide();
			$("ul.physicians li").hide();
			$("ul.physicians li."+physicianSortExpertise).show();
			if($("ul.physicians li."+physicianSortExpertise).size()==0){
				$("p#error-expertise").show();
			}
		});
		/* physicians button hover states */
		$("table.physicians-sort input.button").hover(
			function () { $(this).addClass("button-hover"); }, 
			function () { $(this).removeClass("button-hover"); }
		);
		
	/******************************************************************************
	 opportunities
	******************************************************************************/
	
		/* opportunities list filter */
		$("table.opportunities-sort input#department-go").click(function(){
			opportunitiesSort = $("select#department").val();
			$("div.opportunities div.cms-item").hide();
			$("div.opportunities div."+opportunitiesSort).show();
			$("div.opportunities div.cms-item:last").css({border:"0"});
			if( $("div.opportunities div."+opportunitiesSort).size() == 0 ){
				$("div#error").show();
			}
		});
		/* department button hover states */
		$("table.opportunities-sort input.button").hover(
			function () { $(this).addClass("button-hover"); }, 
			function () { $(this).removeClass("button-hover"); }
		);
	
	/* contact forms */
	$("form.contact input.button").hover(
		function () { $(this).addClass("button-hover"); }, 
		function () { $(this).removeClass("button-hover"); }
	);
	$("input#patient_hospital_unit").parent("td").siblings("td").append("<span class='tip'>if known</span>");
	
	/* "anchor" links or content anchors */
	$(".anchor:last").css({borderBottom:"none"});
	
	$(".anchor .trigger").hover(
		function () { $(this).addClass("active"); }, 
		function () { $(this).removeClass("active"); }
	);
	
	$(".anchor .trigger").click(function(){
		$(this).parent(".anchor").siblings(".anchor").children(".target").slideUp(400);
		$(this).siblings(".target").slideToggle(400);
	});
	
	/* "zebra tables */
	$("table.zebra tr:odd").addClass("odd");
	$("table.zebra tr:even").addClass("even");
	
	$("table.zebra tr").hover(
		function () { $(this).addClass("active"); }, 
		function () { $(this).removeClass("active"); }
	);
	
	/* subanv active state persistence */
	$("div.subnav ul li").hover(
		function () { $(this).addClass("hover"); }, 
		function () { $(this).removeClass("hover"); }
	);
}


function homepage(){
	/* set up cycle */
	$("div.flash div.cycle").prepend("<div class='h1-bg'></div>");
	$("div.flash div.cycle ul.cycles").cycle({ 
		fx:      'scrollLeft', 
		speed:    750, 
		timeout:  5000 
	});
	
	/* set up blocks animation on hover */
	$("div.flash div.block").hover(
		function () { $(this).children("div.block-content").animate({top:"0"}, 200); }, 
		function () { $(this).children("div.block-content").animate({top:"150px"}, 200); }
	);
	
	/* specifically the medical services block */
	$("div.flash div#block-3").hover(
		function () { $(this).children("div.block-content").animate({top:"0"}, 200); }, 
		function () { $(this).children("div.block-content").animate({top:"150px"}, 200); }
	);

	/* remove borderfrom last news-item */
	$("div.news-item:last").css({border:"0"});
}

function uptodate(){
	$("div.uptodate form input#txtSearch").focus(function(){
		if($(this).val() == "Enter your search here"){
			$(this).val("");
		}
	});
	$("div.uptodate form input#txtSearch").blur(function(){
		if($(this).val() == ""){
			$(this).val("Enter your search here");
		}
	});
	$("div.uptodate form input.go").hover(
		function () { $(this).addClass("active");}, 
		function () { $(this).removeClass("active");}
	);
}

/* last minute tack-on for sub nav handling the doc vs. pdf file download */
function applicationType(){
	jQuery("#applications-trigger").click(function(){
		$(this).siblings("ul").slideDown(300);
	});

}/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


