package com.example.smoke_test_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class page_objects {

    //url and path
    public static String url = "https://users.wix.com/signin??";

    public static String url2 = "https://www.amazon.com/sp?_encoding=UTF8&asin=&isAmazonFulfilled=&isCBA=&marketplaceID=ATVPDKIKX0DER&orderID=&seller=A3SN72NI2IQLZX&tab=&vasStoreID=";

    public static String url3 = "https://www.amazon.com/s?me=A3SN72NI2IQLZX&marketplaceID=ATVPDKIKX0DER";

    public static String url4 = "https://support.wix.com/en/article/offering-your-wix-products-on-amazon";

    public static String url5 = "https://www.amazon.com/dp/B09DGCK2FQ?smid=A3SN72NI2IQLZX";

    public static String url6 = "https://www.ebay.com/usr/macan-3045";

    public static String url7 = "https://support.wix.com/en/article/managing-how-wix-products-are-listed-on-ebay";

    public static String storeURL = "https://manage.wix.com/dashboard/4fbe988a-ee78-4fc1-8ba5-90533f372fb4/store/products?referralInfo=sidebar";

    public static String wixUrl = "https://manage.wix.com/dashboard/4fbe988a-ee78-4fc1-8ba5-90533f372fb4/store/ebay/?referralInfo=sidebar";  //macan-3045

    public static String wixUrl2 = "https://manage.wix.com/dashboard/7224a0ee-b71d-4887-9bcd-07aa15902ac7/home?referralInfo=sites-dropdown"; //qa TEST Automation

    public static String wishURL = "https://manage.wix.com/dashboard/7224a0ee-b71d-4887-9bcd-07aa15902ac7/stores-channels-ui"; //WIXSTOREFORQA

    public static String path = "/Users/markc/Downloads/chromedriver";

    public static String path2 = "/Users/markc/Downloads/edgedriver_mac64";

    public static String screenshots = "screenshot.png";

    public static String wixUrl3 = "https://manage.wix.com/dashboard/7224a0ee-b71d-4887-9bcd-07aa15902ac7/store/products?referralInfo=sidebar";  //orders QA Automation
    public static String wixURL7 = "https://manage.wix.com/dashboard/d7a7642b-21c0-460b-a409-9d3103916f64/store/ebay";

    public static String wixURL8 = "https://manage.wix.com/dashboard/7224a0ee-b71d-4887-9bcd-07aa15902ac7/store/ebay/?referralInfo=sidebar";

    public static String wixURL9 = "https://manage.wix.com/dashboard/4fbe988a-ee78-4fc1-8ba5-90533f372fb4/store/ebay/?referralInfo=sidebar";   //ebay

    public static String wixURL10 = "https://manage.wix.com/dashboard/5844f077-353e-48fd-a6a8-9a40fc43c663/store/amazon?referralInfo=sidebar"; //amazon

    public static String wixStoreAmazon = "https://manage.wix.com/dashboard/5844f077-353e-48fd-a6a8-9a40fc43c663/products?referralInfo=sidebar";

    public static String wishmerchantURL = "https://merchant.wish.com/v2-login?next=/product";

    public static String expectedURL = "https://devmain-c-wix.channelsettings.com/amazon/dashboard/test";

//    public static WebDriver driver;

    //Wix Store

    @FindBy(css = ".wix-button > .wix-style-svg-font-icons-plus")
    WebElement newProduct;

    @FindBy(css = ".option:nth-child(2) .option-button")
    WebElement physicalProduct;

    @FindBy(css = ".cke_textarea_inline")
    WebElement wixDescription;

    @FindBy(id = "product-save")
    WebElement wixProductSave;

    @FindBy(name = "price")
    WebElement wixPrice;

    @FindBy(name = "title")
    WebElement wixTitle;

    @FindBy(xpath = "//div[@class='ToggleSwitch1214221615__root ToggleSwitch1475373466__root ToggleSwitch1475373466---skin-8-standard ToggleSwitch1475373466---size-5-small']/input[@class='ToggleSwitch1214221615__input']")
    WebElement trackinventorytoogle;

    @FindBy(css = "[data-hook='option-PHOTO'] .option-button")
    WebElement addImage;

    @FindBy(css = "[data-hook='select-items'] > .s32AMW")
    WebElement addSelectImage;


    //ebay Dashboard

    @FindBy(xpath = "//a[@href='/ebay/settingsv2/']/i[@class='fal fa-cog']")
    WebElement settingsIcon;

    @FindBy(id = "custom_inventory_singlesku")
    WebElement customInventory;

    @FindBy(xpath = "//form[@id='productForm']/div[4]/div[@class='wix-card-header']//span[@class='slider round']")
    WebElement priceSlider;

    @FindBy(css = "[placeholder='Edit for Wish']")
    WebElement variantsEdit;

    @FindBy(css = "[data-hook='product-editor-general-info'] > div:nth-of-type(1) > div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(2) input:nth-of-type(1)")
    WebElement nameSlider;

    @FindBy(xpath= "//input[@value='Single Variant Override Data']")
    WebElement nameField;



    //Ebay Amazon Product Edit

    @FindBy(id = "amazon_price")
    WebElement priceField;

    @FindBy(xpath = "//form[@id='productForm']/div[5]//span[@class='slider round']")
    WebElement quantitySlider;

    @FindBy(id = "amazon_inventory")
    WebElement quantityField;

    @FindBy(css = ".container-fluid")
    WebElement container;

    @FindBy(id = "amazon_price")
    WebElement amazonPrice;

    @FindBy(id = "btn_save2")
    WebElement saveButton;

    @FindBy(id = "ebay_inventory")
    WebElement ebayInventory;

    @FindBy(id = "ebay_price")
    WebElement ebayPrice;

    @FindBy(id = "product_title")
    WebElement ebayTitle;

    @FindBy(id = "bestoffer_autoaccept_price")
    WebElement ebayAutoAccept;

    @FindBy(id = "bestoffer_autodecline_price")
    WebElement ebayAutoDecline;

    @FindBy(css = ".tooltipster-left > .fal")
    WebElement settings;

    @FindBy(linkText = "Inventory Sync")
    WebElement settingsprod;

    @FindBy(id = "search_toggle")
    WebElement searchButton;

    @FindBy(id = "productsearch")
    WebElement productSearch;


    //Login page DEV

    @FindBy(xpath = "//input[@id='identifierId']")
    WebElement userName;

    @FindBy(name = "password")
    WebElement passWord;

    @FindBy(id = "passwordNext")
    WebElement nextButtonPw;

    @FindBy(id = "identifierNext")
    WebElement nextButton;

    //Login Google Login

    @FindBy(css = ".google-button > .buttonContentWrapper")

    WebElement googleLogin;

    //Inventory Settings

    @FindBy(id = "restock_on_quantity")
    WebElement restockQuantity;

    @FindBy(id = "max_import_quantity")
    WebElement maxImportQuantity;

    @FindBy(id = "restock_with_fixed")
    WebElement quanityReaches;


    //dashboard


    @FindBy(id = "collectionfilter")
    WebElement collectionFilter;

    @FindBy(id = "count_unlinked")
    WebElement countUnlinked;

    @FindBy(id = "wix_ebay_unlinked")
    WebElement ebayUnlinked;

    @FindBy(id = "count_published")
    WebElement countpublished;

    @FindBy(css = "#row_8df1afe4-90d1-162d-2d42-b8308125c193 > .td_title")
    WebElement rowselectpublish;

    //Rows in Unpublished use the Wix Product GUID
    @FindBy(css = "#row_94d53277-d0f1-79f5-ef66-828f72954f19 > .td_title")
    //bc4b739b-c76c-2c78-43bb-3aea3acb42bb
            WebElement rowselect;

    @FindBy(css = "#row_8020069b-d2ac-d381-82e8-a7d646595cad > .td_title")
    WebElement rowselectbest;

    @FindBy(css = "#row_c99338a2-d2d0-e633-25f1-006e820859c0 > .td_title")
    WebElement multiproduct;

    @FindBy(css = "#row_c1f35e55-8f3b-6040-29cf-e971db6ca3cb > .td_title")
    WebElement multiproduct2;

    @FindBy(xpath = "//td[contains(.,'Test Data for Inventory Sync')]")
    WebElement getMultiproduct3;

    @FindBy(css = "#row_abf1c1d4-42de-2453-f273-973a5d06df7c > .td_title")
    WebElement rowForSelection;

    @FindBy(id = "btn-import-start")
    WebElement acceptPublish;

    @FindBy(id = "btn-unpublish")
    WebElement acceptunpublish;

    @FindBy(id = "btn_save2")
    WebElement publish;

    @FindBy(id = "unpublish_link2")
    WebElement unpublish;

    @FindBy(css = "#row_1258442 > td.td_last.noclick")
    WebElement rowpub;

    @FindBy(id = "bulk_edit_price_Value")
    @CacheLookup
    WebElement amount1;

    @FindBy(id = "bulk_edit_price_SetPrice")
    @CacheLookup
    WebElement amount2;

    @FindBy(id = "bulk_edit_inventory_Quantity")
    @CacheLookup
    WebElement amount3;

    @FindBy(id = "btn-bulk-price")
    @CacheLookup
    WebElement apply1;

    @FindBy(id = "btn-bulk-inventory")
    @CacheLookup
    WebElement apply2;

    @FindBy(id = "btn-bulk-policies-shipping")
    @CacheLookup
    WebElement apply3;

    @FindBy(id = "btn-bulk-policies-return")
    @CacheLookup
    private WebElement apply4;

    @FindBy(id = "btn-bulk-policies-payment")
    @CacheLookup
    private WebElement apply5;

    @FindBy(id = "btn-bulk-cats")
    @CacheLookup
    private WebElement apply6;

    @FindBy(id = "chk-1c1c48ac-38a0-43f0-ae87-2963b1b1c8af")
    @CacheLookup
    private WebElement artificialMiniPottedFlowersLavender;

    @FindBy(id = "check_all")
    @CacheLookup
    WebElement bundlesOutdoorArtificialFlowersUv124;

    @FindBy(id = "chk-912b9ce4-f942-4355-4d3e-80c8eb2f87aa")
    @CacheLookup
    WebElement bundlesOutdoorArtificialFlowersUv224;

    @FindBy(id = "chk-4b9bfbf5-066a-44c3-8345-d4adeb55b951")
    @CacheLookup
    WebElement bundlesOutdoorArtificialFlowersUv324;

    @FindBy(id = "chk-3ccaf8e8-31b1-4988-b714-b99f294b9a67")
    @CacheLookup
    WebElement bundlesOutdoorArtificialFlowersUv424;

    @FindBy(id = "chk-36ff96e2-854e-8225-829e-403f746832a0")
    @CacheLookup
    private WebElement bundlesOutdoorArtificialFlowersUv524;

    @FindBy(id = "chk-2b9f5f57-bec4-49b6-83a6-179a03c114d3")
    @CacheLookup
    private WebElement bundlesOutdoorArtificialFlowersUv624;

    @FindBy(id = "chk-02b86a10-a09a-570d-c983-52e9d272171c")
    @CacheLookup
    private WebElement bundlesOutdoorArtificialFlowersUv724;

    @FindBy(css = "#modal-bulk-price div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement cancel1;

    @FindBy(css = "#modal-bulk-applyshippingprofile div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement cancel2;

    @FindBy(css = "#modal-bulk-applyreturnprofile div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement cancel3;

    @FindBy(css = "#modal-bulk-applypaymentprofile div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement cancel4;

    @FindBy(css = "#modal-bulk-cats div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement cancel5;

    @FindBy(css = "#category-picker div:nth-of-type(3) button.btn.wix.wix-default.medium")
    @CacheLookup
    private WebElement cancel6;

    @FindBy(css = "#modal-confirm-delete div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement cancel7;

    @FindBy(css = "button.btn.wix.wix-default.closeimport.medium")
    @CacheLookup
    private WebElement cancel8;

    @FindBy(css = "#product-modal div:nth-of-type(3) button.btn.wix.wix-default.medium")
    @CacheLookup
    private WebElement cancel9;

    @FindBy(id = "bulk_cat_lnk")
    @CacheLookup
    private WebElement category;

    @FindBy(id = "reset_filters")
    @CacheLookup
    private WebElement clearAndTryAgain;

    @FindBy(css = "#modal-bulk-inventory div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement close1;

    @FindBy(css = "#modal-unpublish div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement close2;

    @FindBy(css = "#modal-bulk-applyshippingprofile div:nth-of-type(2) table tbody tr td:nth-of-type(2) div.btn-group div.dropdown-menu.wix-dropdown a:nth-of-type(1)")
    @CacheLookup
    private WebElement createNewPolicy1;

    @FindBy(css = "#modal-bulk-applyreturnprofile div:nth-of-type(2) table tbody tr td:nth-of-type(2) div.btn-group div.dropdown-menu.wix-dropdown a:nth-of-type(1)")
    @CacheLookup
    private WebElement createNewPolicy2;

    @FindBy(css = "#modal-bulk-applypaymentprofile div:nth-of-type(2) table tbody tr td:nth-of-type(2) div.btn-group div.dropdown-menu.wix-dropdown a:nth-of-type(1)")
    @CacheLookup
    private WebElement createNewPolicy3;

    @FindBy(id = "bulk_edit_applyallprofiles_PaymentProfileID")
    @CacheLookup
    private WebElement defaultPaymentPolicydefaultPaymentPolicynewPolicy1;

    @FindBy(css = "#modal-bulk-applypaymentprofile div:nth-of-type(2) table tbody tr td:nth-of-type(1) div.control-group div.controls.block div div.selectric-wrapper.selectric-select.selectric-wix_select input.selectric-input")
    @CacheLookup
    private WebElement defaultPaymentPolicydefaultPaymentPolicynewPolicy2;

    @FindBy(id = "bulk_edit_applyallprofiles_ReturnProfileID")
    @CacheLookup
    private WebElement defaultReturnPolicydefaultReturnPolicy1;

    @FindBy(css = "#modal-bulk-applyreturnprofile div:nth-of-type(2) table tbody tr td:nth-of-type(1) div.control-group div.controls.block div div.selectric-wrapper.selectric-select.selectric-wix_select input.selectric-input")
    @CacheLookup
    private WebElement defaultReturnPolicydefaultReturnPolicy2;

    @FindBy(id = "bulk_edit_applyallprofiles_ShippingProfileID")
    @CacheLookup
    private WebElement defaultShippingPolicydefaultShippingPolicy1;

    @FindBy(css = "#modal-bulk-applyshippingprofile div:nth-of-type(2) table tbody tr td:nth-of-type(1) div.control-group div.controls.block div div.selectric-wrapper.selectric-select.selectric-wix_select input.selectric-input")
    @CacheLookup
    private WebElement defaultShippingPolicydefaultShippingPolicy2;

    @FindBy(id = "btn-delete")
    @CacheLookup
    private WebElement delete;

    @FindBy(id = "hide_publish_terms")
    @CacheLookup
    private WebElement doNotShowThisAgain1;

    @FindBy(id = "linkproductsearch")
    @CacheLookup
    private WebElement doNotShowThisAgain2;

    @FindBy(css = "#modal-map-variants div:nth-of-type(3) button:nth-of-type(1)")
    @CacheLookup
    private WebElement done;

    @FindBy(id = "ebay_terms_link")
    @CacheLookup
    private WebElement ebaysTermsAndConditions;

    @FindBy(id = "edit_policy_shipping")
    @CacheLookup
    private WebElement editPolicy1;

    @FindBy(id = "edit_policy_return")
    @CacheLookup
    private WebElement editPolicy2;

    @FindBy(id = "edit_policy_payment")
    @CacheLookup
    private WebElement editPolicy3;

    @FindBy(id = "chk-01d4f422-cb26-4c4f-b3f9-8d0f25564968")
    @CacheLookup
    private WebElement feetArtificialArecaPalmPlant5;

    @FindBy(id = "chk-3e45b4a8-9034-189b-cc90-c4bd85c94efb")
    @CacheLookup
    private WebElement ftFicusArtificialTreesForIndoor6;

    @FindBy(id = "bulk_edit_inventory_AdjustOperator")
    @CacheLookup
    private WebElement increaseAmountByincreaseAmountBydecreaseAmount1;

    @FindBy(css = "#modal-bulk-inventory div:nth-of-type(2) table:nth-of-type(1) tbody tr td div.controls.block div div.selectric-wrapper.selectric-select.selectric-wix_select input.selectric-input")
    @CacheLookup
    private WebElement increaseAmountByincreaseAmountBydecreaseAmount2;

    @FindBy(id = "bulk_edit_price_AdjustOperator")
    @CacheLookup
    private WebElement increasePriceByincreasePriceBydecreasePrice1;

    @FindBy(css = "#modal-bulk-price div:nth-of-type(2) div.controls.block div div.selectric-wrapper.selectric-select.selectric-wix_select input.selectric-input")
    @CacheLookup
    private WebElement increasePriceByincreasePriceBydecreasePrice2;

    @FindBy(css = "a[href='#modal-bulk-inventory']")
    @CacheLookup
    private WebElement inventoryAmount;

    @FindBy(css = "a[title='Learn more']")
    @CacheLookup
    private WebElement learnMore;

    @FindBy(css = "#row_94d53277-d0f1-79f5-ef66-828f72954f19 > .td_title")
    @CacheLookup
    WebElement row;

    @FindBy(id = "bc4b739b-c76c-2c78-43bb-3aea3acb42bb")
    @CacheLookup
    WebElement row2;


    @FindBy(id = "managedd")
    @CacheLookup
    private WebElement manage;

    @FindBy(id = "premium_maybe_later")
    @CacheLookup
    private WebElement maybeLater;

    @FindBy(id = "categorysearch")
    @CacheLookup
    private WebElement noCategoriesMatchThisSearch;

    @FindBy(css = "#table-header-wrap div.products_selected_wrap.hide div.control-group.rounded.hide div.controls div div.selectric-wrapper.selectric-select.selectric-wix_select div:nth-of-type(1) select.select.wix_select")
    @CacheLookup
    private WebElement noProductsMatchedThisFilter1;

    @FindBy(css = "#table-header-wrap div.products_selected_wrap.hide div.control-group.rounded.hide div.controls div div.selectric-wrapper.selectric-select.selectric-wix_select input.selectric-input")
    @CacheLookup
    private WebElement noProductsMatchedThisFilter2;

    @FindBy(css = "#collectionfilter div.selectric-wrapper.selectric-select.selectric-wix_select div:nth-of-type(1) select.select.wix_select")
    @CacheLookup
    private WebElement noProductsMatchedThisFilter3;

    @FindBy(css = "#collectionfilter div.selectric-wrapper.selectric-select.selectric-wix_select input.selectric-input")
    @CacheLookup
    private WebElement noProductsMatchedThisFilter4;

    @FindBy(css = "#select-filter div.selectric-wrapper.selectric-select.selectric-wix_select div:nth-of-type(1) select.select.wix_select")
    @CacheLookup
    private WebElement noProductsMatchedThisFilter5;

    @FindBy(css = "#select-filter div.selectric-wrapper.selectric-select.selectric-wix_select input.selectric-input")
    @CacheLookup
    private WebElement noProductsMatchedThisFilter6;

    @FindBy(id = "productsearch")
    @CacheLookup
    private WebElement noProductsMatchedThisFilter7;

    private final String pageLoadedText = "24 Bundles Outdoor Artificial Flowers UV Resistant Fake Boxwood Plants";

    private final String pageUrl = "/ebay/dashboard/";

    @FindBy(css = "a[href='#modal-bulk-applypaymentprofile']")
    @CacheLookup
    private WebElement paymentPolicy;

    @FindBy(css = "a[href='#modal-bulk-price']")
    @CacheLookup
    private WebElement price;

    @FindBy(id = "bulk-publish")
    @CacheLookup
    private WebElement publish1;

    @FindBy(css = "#row_02b86a10-a09a-570d-c983-52e9d272171c td:nth-of-type(6) button.btn.wix.wix-standard.hidden_action.publish_item.medium")
    @CacheLookup
    WebElement publish10;

    @FindBy(css = "#row_01d4f422-cb26-4c4f-b3f9-8d0f25564968 td:nth-of-type(6) button.btn.wix.wix-standard.hidden_action.publish_item.medium")
    @CacheLookup
    private WebElement publish11;

    @FindBy(css = "#row_a0f918b4-c690-42e0-8cfa-42946536aca6 td:nth-of-type(6) button.btn.wix.wix-standard.hidden_action.publish_item.medium")
    @CacheLookup
    WebElement publish2;

    @FindBy(css = "#row_912b9ce4-f942-4355-4d3e-80c8eb2f87aa td:nth-of-type(6) button.btn.wix.wix-standard.hidden_action.publish_item.medium")
    @CacheLookup
    private WebElement publish3;

    @FindBy(css = "#row_4b9bfbf5-066a-44c3-8345-d4adeb55b951 td:nth-of-type(6) button.btn.wix.wix-standard.hidden_action.publish_item.medium")
    @CacheLookup
    private WebElement publish4;

    @FindBy(css = "#row_3e45b4a8-9034-189b-cc90-c4bd85c94efb td:nth-of-type(6) button.btn.wix.wix-standard.hidden_action.publish_item.medium")
    @CacheLookup
    WebElement publish5;

    @FindBy(css = "#row_e96cd5ce-a141-4d9f-8f43-ae3ef58fad66 > td.actions.noclick > div.btn-group.row_actions > a")

    WebElement publishRow;

    @FindBy(css = "#row_3ccaf8e8-31b1-4988-b714-b99f294b9a67 td:nth-of-type(6) button.btn.wix.wix-standard.hidden_action.publish_item.medium")
    @CacheLookup
    WebElement publish6;

    @FindBy(css = "#row_36ff96e2-854e-8225-829e-403f746832a0 td:nth-of-type(6) button.btn.wix.wix-standard.hidden_action.publish_item.medium")
    @CacheLookup
    private WebElement publish7;

    @FindBy(css = "#row_2b9f5f57-bec4-49b6-83a6-179a03c114d3 td:nth-of-type(6) button.btn.wix.wix-standard.hidden_action.publish_item.medium")
    @CacheLookup
    private WebElement publish8;

    @FindBy(css = "#row_1c1c48ac-38a0-43f0-ae87-2963b1b1c8af td:nth-of-type(6) button.btn.wix.wix-standard.hidden_action.publish_item.medium")
    @CacheLookup
    private WebElement publish9;

    @FindBy(id = "reset_cats")
    @CacheLookup
    private WebElement resetCategory;

    @FindBy(css = "a.reset_filters")
    @CacheLookup
    private WebElement resetFilters;

    @FindBy(css = "a[href='#modal-bulk-applyreturnprofile']")
    @CacheLookup
    private WebElement returnPolicy;

    @FindBy(id = "btn-ok-map-variants")
    @CacheLookup
    private WebElement save;

    @FindBy(id = "chk-a0f918b4-c690-42e0-8cfa-42946536aca6")
    @CacheLookup
    private WebElement setOf6SmallArtificialSucculent;

    @FindBy(css = "a[href='#modal-bulk-applyshippingprofile']")
    @CacheLookup
    private WebElement shippingPolicy;

    @FindBy(id = "bulk-unpublish")
    @CacheLookup
    private WebElement unpublish1;

    @FindBy(id = "btn-unpublish")
    @CacheLookup
    private WebElement unpublish2;

    @FindBy(id = "packagePickerLink")
    @CacheLookup
    private WebElement upgradeNow;

    @FindBy(id = "view_ebay")
    WebElement viewMyListings;

    //wish

    @FindBy(css = "#root > div > div._2nXlK > div.JQSri > div.muWrf > div._2SkCn > div > div > div > div > span > div.s3PxqM > div > div > div > div.s3LdE0.s1zAi3 > div > div > div > div > div:nth-child(2) > div > div > div:nth-child(1) > div > div.sbQkDu > div.s1wLdu.o3AIlY---position-3-end > span:nth-child(2) > div > div > div > div > div > div > div > input")
    WebElement search;

    @FindBy(css = "[placeholder='Search']")
    WebElement search2;

    @FindBy(linkText = "Automation Test DataAEWpi")
    WebElement productSelect;

    @FindBy(css = ".sMCjW1:nth-child(1) .s1K2R1")
    WebElement Edit_Row;

    @FindBy(css = ".s1ilKQ:nth-child(3) .s_tBHM")
    WebElement EditforWishName;

    @FindBy(css = ".o15hqD--hasFocus .s3aJjY")
    WebElement NameField;

    @FindBy(css = "#root > div > div._2nXlK > div.JQSri > div.muWrf > div._2SkCn > div > div > div > div > span > div > div > div > div > div.s3LdE0.s1zAi3 > div > div > div > div > div:nth-child(2) > div:nth-child(4) > div:nth-child(3) > div > div:nth-child(3) > div > div.s24urx > div > div > div > div > div > div > div > svg > path")
    WebElement NameErrorToolTip;

    @FindBy(id = "\"wsr-modal63\"")
    WebElement confirmationmodal;

    @FindBy(css = "#root > div > div._2nXlK > div.JQSri > div.muWrf > div._2SkCn > div > div > div > div > span > div > div > div > div > div.s2rVGA > div > div.s10pNc > div > div.sBbE9K > div > div:nth-child(3) > div.sDzhzw.s2UR26.s1W4Rv.o1t7CI--withWidth.o1t7CI--withArrow.s3toZQ > div > button")
    WebElement Save;

    @FindBy(xpath = "//span[contains(.,'Save & update')]")
    WebElement SaveandPublish;

    public static By customize = By.id("custom_images");
    public static By customizeName = By.id("custom_title");
    public static By customizeDescription = By.id("custom_description");
    public static By customizeVariant = By.id("custom_variant_inventory");
    public static By customizeVariantPrice = By.id("custom_variant_price");

    public class PageObject {
        public PageObject(WebDriver driver) {

            PageFactory.initElements(driver, this);

        }
    }
}