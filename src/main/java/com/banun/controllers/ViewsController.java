package com.banun.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewsController {

	@RequestMapping(value="/home")
	public String goHome(){
		
		return "views/index";
	}
	
	
	@RequestMapping(value="/blog-full-width")
	public String pageBlogFullWidth(){
		
		return "views/blog-full-width";
	}
	
	@RequestMapping(value="/blog-left-sidebar")
	public String pageBlogLeftSidebar(){
		
		return "views/blog-left-sidebar";
	}
	
	@RequestMapping(value="/blog-right-sidebar")
	public String pageBlogRightSidebar(){
		
		return "views/blog-right-sidebar";
	}
	
	
	
	
	@RequestMapping(value="/blog-masonry-full-width")
	public String pageBlogMasonryFullWidth(){
		
		return "views/blog-masonry-full-width";
	}
	
	@RequestMapping(value="/blog-masonry-sidebar")
	public String pageBlogMasonrySidebar(){
		
		return "views/blog-masonry-sidebar";
	}
	
	
	
	@RequestMapping(value="/blog-masonry")
	public String pageBlogMasonry(){
		
		return "views/blog-masonry";
	}
	
	
	@RequestMapping(value="/blog-single-sidebar-left")
	public String pageBlogSingleSideBarLeft(){
		
		return "views/blog-single-sidebar-left";
	}
	
	@RequestMapping(value="/blog-single-sidebar-no")
	public String pageBlogSingleSideBarNo(){
		
		return "views/blog-single-sidebar-no";
	}
	
	@RequestMapping(value="/blog-single-sidebar-right")
	public String pageBlogSingleSideBarRight(){
		
		return "views/blog-single-sidebar-right";
	}
	
	@RequestMapping(value="/blog-timeline")
	public String pageBlogTimeline(){
		
		return "views/blog-timeline";
	}
	
	@RequestMapping(value="/church-home")
	public String pageChurchHome(){
		
		return "views/church-home";
	}
	
	@RequestMapping(value="/college-home")
	public String pageCollegeHome(){
		
		return "views/college-home";
	}
	
	@RequestMapping(value="/contact-us-2")
	public String pageContactUs2(){
		
		return "views/contact-us-2";
	}
	
	@RequestMapping(value="/contact-us-3")
	public String pageContactUs3(){
		
		return "views/contact-us-3";
	}
	
	@RequestMapping(value="/contact-us-4")
	public String pageContactUs4(){
		
		return "views/contact-us-4";
	}
	
	@RequestMapping(value="/contact-us")
	public String pageContactUs(){
		
		return "views/contact-us";
	}
	
	@RequestMapping(value="/email-template")
	public String pageEmailTemplate(){
		
		return "views/email-template";
	}
	
	@RequestMapping(value="/feature-animations")
	public String pageFeatureAnimations(){
		
		return "views/feature-animations";
	}
	
	@RequestMapping(value="/feature-content-carousel")
	public String pageFeatureContentCarousel(){
		
		return "views/feature-content-carousel";
	}
	
	@RequestMapping(value="/feature-grid-system")
	public String pageFeatureGridSystem(){
		
		return "views/feature-grid-system";
	}
	
	@RequestMapping(value="/feature-icons")
	public String pageFeatureIcons(){
		
		return "views/feature-icons";
	}
	
	
	@RequestMapping(value="/feature-pricing-tables")
	public String pageFeaturePricingTables(){
		
		return "views/feature-pricing-tables";
	}
	
	
	@RequestMapping(value="/feature-testimonials")
	public String pageFeatureTestimonials(){
		
		return "views/feature-testimonials";
	}
	
	@RequestMapping(value="/feature-typograpy")
	public String pageFeatureTypograpy(){
		
		return "views/feature-typograpy";
	}
	
	@RequestMapping(value="/header-1")
	public String pageHeader1(){
		
		return "views/header-1";
	}
	
	@RequestMapping(value="/header-2")
	public String pageHeader2(){
		
		return "views/header-2";
	}
	
	@RequestMapping(value="/header-3")
	public String pageHeader3(){
		
		return "views/header-3";
	}
	
	@RequestMapping(value="/header-4")
	public String pageHeader4(){
		
		return "views/header-4";
	}
	
	
	
	
	@RequestMapping(value="/index-dark")
	public String pageIndexDark(){
		
		return "views/index-dark";
	}
	
	
	@RequestMapping(value="/index-extended")
	public String pageIndexExtended(){
		
		return "views/index-extended";
	}
	
	@RequestMapping(value="/index-minimal")
	public String pageIndexMinimal(){
		
		return "views/index-minimal";
	}
	
	
	@RequestMapping(value="/index-more")
	public String pageIndexMore(){
		
		return "views/index-more";
	}
	
	
	@RequestMapping(value="/index2")
	public String pageIndex(){
		
		return "views/index";
	}
	
	
	@RequestMapping(value="/magazine-category")
	public String pageMagazineCategory(){
		
		return "views/magazine-category";
	}
	
	
	@RequestMapping(value="/magazine-home")
	public String pageMagazineHome(){
		
		return "views/magazine-home";
	}
	
	
	@RequestMapping(value="/magazine-single")
	public String pageMagazineSingle(){
		
		return "views/magazine-single";
	}
	
	
	@RequestMapping(value="/medical-home")
	public String pageMedicalHome(){
		
		return "views/medical-home";
	}
	
	
	
	@RequestMapping(value="/onepage-revolution")
	public String pageOnepageRevolution(){
		
		return "views/onepage-revolution";
	}
	
	
	@RequestMapping(value="/onepage-superslides")
	public String pageOnepageSuperslides(){
		
		return "views/onepage-superslides";
	}
	
	
	@RequestMapping(value="/page-about-me")
	public String pageAboutMe(){
		
		return "views/page-about-me";
	}
	
	
	@RequestMapping(value="/page-about-us")
	public String pageAboutUs(){
		
		return "views/page-about-us";
	}
	
	
	@RequestMapping(value="/page-coming-soon-image")
	public String pageComingSoonImage(){
		
		return "views/page-coming-soon-image";
	}
	
	
	@RequestMapping(value="/page-coming-soon-video")
	public String pageComingSoonVideo(){
		
		return "views/page-coming-soon-video";
	}
	
	
	@RequestMapping(value="/page-empty")
	public String pageEmpty(){
		
		return "views/page-empty";
	}
	
	
	@RequestMapping(value="/page-faq")
	public String pageFaq(){
		
		return "views/page-faq";
	}
	
	
	@RequestMapping(value="/page-full-width")
	public String pageFullWidth(){
		
		return "views/page-full-width";
	}
	
	
	
	@RequestMapping(value="/page-header-basic")
	public String pageHeaderBasic(){
		
		return "views/page-header-basic";
	}
	
	
	@RequestMapping(value="/page-header-delayed-parallax")
	public String pageHeaderDelayedParallax(){
		
		return "views/page-header-delayed-parallax";
	}
	
	
	
	@RequestMapping(value="/page-header-image")
	public String pageHeaderImage(){
		
		return "views/page-header-image";
	}
	
	
	@RequestMapping(value="/page-header-overlay1")
	public String pageHeaderOverlay1(){
		
		return "views/page-header-overlay1";
	}
	
	@RequestMapping(value="/page-header-overlay2")
	public String pageHeaderOverlay2(){
		
		return "views/page-header-overlay2";
	}
	
	
	@RequestMapping(value="/page-header-overlay3")
	public String pageHeaderOverlay3(){
		
		return "views/page-header-overlay3";
	}
	
	
	@RequestMapping(value="/page-header-standard-parallax")
	public String pageHeaderStandardParallax(){
		
		return "views/page-header-standard-parallax";
	}
	
	
	
	@RequestMapping(value="/page-invoice")
	public String pageInvoice(){
		
		return "views/page-invoice";
	}
	
	
	@RequestMapping(value="/page-left-sidebar")
	public String pageLeftSidebar(){
		
		return "views/page-left-sidebar";
	}
	
	
	@RequestMapping(value="/page-maintenance")
	public String pageMaintenance(){
		
		return "views/page-maintenance";
	}
	
	
	@RequestMapping(value="/page-pricing-extended")
	public String pagePricingExtended(){
		
		return "views/page-pricing-extended";
	}
	
	
	@RequestMapping(value="/page-pricing")
	public String pagePricing(){
		
		return "views/page-pricing";
	}
	
	
	@RequestMapping(value="/page-privacy-policy")
	public String pagePrivacyPolicy(){
		
		return "views/page-privacy-policy";
	}
	
	
	@RequestMapping(value="/page-right-sidebar")
	public String pageRightSidebar(){
		
		return "views/page-right-sidebar";
	}
	
	
	@RequestMapping(value="/page-services")
	public String pageServices(){
		
		return "views/page-services";
	}
	
	
	@RequestMapping(value="/page-signin")
	public String pageSignin(){
		
		return "views/page-signin";
	}
	
	
	@RequestMapping(value="/page-signup")
	public String pageSignup(Model model){
		
		 
	
		return "views/page-signup";
	}
	
	
	@RequestMapping(value="/page-sitemap")
	public String pageSitemap(){
		
		return "views/page-sitemap";
	}
	
	
	@RequestMapping(value="/page-support")
	public String pageSupport(){
		
		return "views/page-support";
	}
	
	
	@RequestMapping(value="/page-team")
	public String pageTeam(){
		
		return "views/page-team";
	}
	
	@RequestMapping(value="/page-terms-and-conditions")
	public String pageTermsAndConditions(){
		
		return "views/page-terms-and-conditions";
	}
	
	
	@RequestMapping(value="/page-testimonials")
	public String pageTestimonials(){
		
		return "views/page-testimonials";
	}
	
	
	@RequestMapping(value="/portfolio-2-columns")
	public String pagePortfolio2Columns(){
		
		return "views/portfolio-2-columns";
	}
	
	@RequestMapping(value="/portfolio-3-columns")
	public String pagePortfolio3Columns(){
		
		return "views/portfolio-3-columns";
	}
	
	@RequestMapping(value="/portfolio-4-columns")
	public String pagePortfolio4Columns(){
		
		return "views/portfolio-4-columns";
	}
	
	
	@RequestMapping(value="/portfolio-full-center")
	public String pagePortfolioFullCentre(){
		
		return "views/portfolio-full-center";
	}
	
	
	@RequestMapping(value="/portfolio-full-width")
	public String pagePortfolioFullWidth(){
		
		return "views/portfolio-full-width";
	}
	
	
	
	@RequestMapping(value="/portfolio-home")
	public String pagePortfolioHome(){
		
		return "views/portfolio-home";
	}
	
	
	@RequestMapping(value="/portfolio-lightbox")
	public String pagePortfolioLightbox(){
		
		return "views/portfolio-lightbox";
	}
	
	
	
	@RequestMapping(value="/portfolio-single-extended")
	public String pagePortfolioSingleExtended(){
		
		return "views/portfolio-single-extended";
	}
	
	
	@RequestMapping(value="/portfolio-single-full-slider")
	public String pagePortfolioSingleFullSlider(){
		
		return "views/portfolio-single-full-slider";
	}
	
	
	@RequestMapping(value="/portfolio-single-sidebar")
	public String pagePortfolioSingleSidebar(){
		
		return "views/portfolio-single-sidebar";
	}
	
	
	@RequestMapping(value="/portfolio-single")
	public String pagePortfolioSingle(){
		
		return "views/portfolio-single";
	}
	
	
	@RequestMapping(value="/realestate-home")
	public String pageRealEstateHome(){
		
		return "views/realestate-home";
	}
	
	
	@RequestMapping(value="/realestate-list")
	public String pageRealEstateList(){
		
		return "views/realestate-list";
	}
	
	
	@RequestMapping(value="/realestate-single")
	public String pageRealEstateSingle(){
		
		return "views/realestate-single";
	}
	
	
	@RequestMapping(value="/revolution-full-slider")
	public String pageRevolutionFullSlider(){
		
		return "views/revolution-full-slider";
	}
	
	@RequestMapping(value="/revolution-half-slider")
	public String pageRevolutionHalfSlider(){
		
		return "views/revolution-half-slider";
	}
	
	@RequestMapping(value="/revolution-ken-burns")
	public String pageRevolutionKenBurns(){
		
		return "views/revolution-ken-burns";
	}
	
	@RequestMapping(value="/revolution-official-1")
	public String pageRevolutionOfficial1(){
		
		return "views/revolution-official-1";
	}
	
	@RequestMapping(value="/revolution-official-2")
	public String pageRevolutionOfficial2(){
		
		return "views/revolution-official-2";
	}
	
	
	@RequestMapping(value="/revolution-official-3")
	public String pageRevolutionOfficial3(){
		
		return "views/revolution-official-3";
	}
	
	@RequestMapping(value="/revolution-official-4")
	public String pageRevolutionOfficial4(){
		
		return "views/revolution-official-4";
	}
	
	@RequestMapping(value="/revolution-official-5")
	public String pageRevolutionOfficial5(){
		
		return "views/revolution-official-5";
	}
	
	@RequestMapping(value="/revolution-official-6")
	public String pageRevolutionOfficial6(){
		
		return "views/revolution-official-6";
	}
	
	@RequestMapping(value="/revolution-official-7")
	public String pageRevolutionOfficial7(){
		
		return "views/revolution-official-7";
	}
	
	@RequestMapping(value="/revolution-official-8")
	public String pageRevolutionOfficial8(){
		
		return "views/revolution-official-8";
	}
	
	@RequestMapping(value="/revolution-official-9")
	public String pageRevolutionOfficial9(){
		
		return "views/revolution-official-9";
	}
	
	@RequestMapping(value="/revolution-official-10")
	public String pageRevolutionOfficial10(){
		
		return "views/revolution-official-10";
	}
	
	@RequestMapping(value="/revolution-official-11")
	public String pageRevolutionOfficial11(){
		
		return "views/revolution-official-11";
	}
	
	@RequestMapping(value="/revolution-official-12")
	public String pageRevolutionOfficial12(){
		
		return "views/revolution-official-12";
	}
	
	@RequestMapping(value="/revolution-official-13")
	public String pageRevolutionOfficial13(){
		
		return "views/revolution-official-13";
	}
	
	@RequestMapping(value="/revolution-official-14")
	public String pageRevolutionOfficial14(){
		
		return "views/revolution-official-14";
	}
	
	@RequestMapping(value="/revolution-official-15")
	public String pageRevolutionOfficial15(){
		
		return "views/revolution-official-15";
	}
	
	
	@RequestMapping(value="/revolution-official-16")
	public String pageRevolutionOfficial16(){
		
		return "views/revolution-official-16";
	}
	
	
	@RequestMapping(value="/revolution-official-17")
	public String pageRevolutionOfficial17(){
		
		return "views/revolution-official-17";
	}
	
	
	@RequestMapping(value="/revolution-video")
	public String pageRevolutionVideo(){
		
		return "views/revolution-video";
	}
	
	
	@RequestMapping(value="/shop-cart")
	public String pageShopCart(){
		
		return "views/shop-cart";
	}
	
	
	@RequestMapping(value="/shop-cc-pay")
	public String pageShopCcPay(){
		
		return "views/shop-cc-pay";
	}
	
	
	@RequestMapping(value="/shop-full-width")
	public String pageShopFullWidth(){
		
		return "views/shop-full-width";
	}
	
	
	@RequestMapping(value="/shop-home")
	public String pageShopHome(){
		
		return "views/shop-home";
	}
	
	
	@RequestMapping(value="/shop-product-full-width")
	public String pageShopProductFullWidth(){
		
		return "views/shop-product-full-width";
	}
	
	@RequestMapping(value="/shop-product-sidebar")
	public String pageShopProductSidebar(){
		
		return "views/shop-product-sidebar";
	}
	
	@RequestMapping(value="/shop-sidebar")
	public String pageShopSidebar(){
		
		return "views/shop-sidebar";
	}
	
	
	@RequestMapping(value="/shortcodes-alerts")
	public String pageShortcodesAlerts(){
		
		return "views/shortcodes-alerts";
	}
	
	
	@RequestMapping(value="/shortcodes-buttons")
	public String pageShortcodesButtons(){
		
		return "views/shortcodes-buttons";
	}
	
	
	@RequestMapping(value="/shortcodes-callouts")
	public String pageShortcodesCallouts(){
		
		return "views/shortcodes-callouts";
	}
	
	
	@RequestMapping(value="/shortcodes-carousel")
	public String pageShortcodesCarousel(){
		
		return "views/shortcodes-carousel";
	}
	
	@RequestMapping(value="/shortcodes-counters")
	public String pageShortcodesCounters(){
		
		return "views/shortcodes-counters";
	}
	
	@RequestMapping(value="/shortcodes-dividers")
	public String pageShortcodesDividers(){
		
		return "views/shortcodes-dividers";
	}
	
	
	@RequestMapping(value="/shortcodes-editor")
	public String pageShortcodesEditor(){
		
		return "views/shortcodes-editor";
	}
	
	@RequestMapping(value="/shortcodes-forms")
	public String pageShortcodesForms(){
		
		return "views/shortcodes-forms";
	}
	
	
	@RequestMapping(value="/shortcodes-icons-and-boxes")
	public String pageShortcodesIconsAndBoxes(){
		
		return "views/shortcodes-icons-and-boxes";
	}
	
	@RequestMapping(value="/shortcodes-lightbox")
	public String pageShortcodesLightbox(){
		
		return "views/shortcodes-lightbox";
	}
	
	
	@RequestMapping(value="/shortcodes-modal-ajax-test")
	public String pageShortcodesModalAjaxTest(){
		
		return "views/shortcodes-modal-ajax-test";
	}
	
	
	@RequestMapping(value="/shortcodes-modals")
	public String pageShortcodesModals(){
		
		return "views/shortcodes-modals";
	}
	
	@RequestMapping(value="/shortcodes-progress-bars")
	public String pageShortcodesProgressBars(){
		
		return "views/shortcodes-progress-bars";
	}
	
	
	@RequestMapping(value="/shortcodes-rows")
	public String pageShortcodesRows(){
		
		return "views/shortcodes-rows";
	}
	
	
	@RequestMapping(value="/shortcodes-tables")
	public String pageShortcodesTables(){
		
		return "views/shortcodes-tables";
	}
	
	@RequestMapping(value="/shortcodes-tabs-and-accordions")
	public String pageShortcodesTabsAndAccordions(){
		
		return "views/shortcodes-tabs-and-accordions";
	}
	
	
	@RequestMapping(value="/shortcodes-toggles")
	public String pageShortcodesToggles(){
		
		return "views/shortcodes-toggles";
	}
	
	
	@RequestMapping(value="/shortcodes-tooltips-and-popover")
	public String pageShortcodesToltipsAndPopover(){
		
		return "views/shortcodes-tooltips-and-popover";
	}
	
	
	@RequestMapping(value="/shortcodes-video")
	public String pageShortcodesVideo(){
		
		return "views/shortcodes-video";
	}
	
	
	@RequestMapping(value="/superslides-slider-full")
	public String pageSuperslidesSliderFull(){
		
		return "views/superslides-slider-full";
	}
	
	
	@RequestMapping(value="/superslides-slider-half")
	public String pageSuperslidesSliderHalf(){
		
		return "views/superslides-slider-half";
	}
	
	
	@RequestMapping(value="/superslides-video-full")
	public String pageSuperslidesVideoFull(){
		
		return "views/superslides-video-full";
	}
	
	@RequestMapping(value="/superslides-video")
	public String pageSuperslidesVideo(){
		
		return "views/superslides-video";
	}
	
	@RequestMapping(value="/shop-login")
	public String pageShopLogin(){
		
		return "views/shop-login";
	}
	
	@RequestMapping(value="/page-with-error")
	public String pageCustomGlobalExceptionHandling(){
		
		return "views/page-with-error";
	}
	
	@RequestMapping(value="/page-404")
	public String page404(){
		
		return "views/page-404";
	}
		
	
}
