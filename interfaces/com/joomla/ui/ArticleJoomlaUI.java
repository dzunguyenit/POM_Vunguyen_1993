package com.joomla.ui;

public class ArticleJoomlaUI {
	public static final String NEW_BTN = "//button[contains(.,'New')]";
	public static final String TITLE_TXT = "//input[@id='jform_title']";
	public static final String CATEGORY_DROPDOWN = "//*[@id='jform_catid_chzn']";
	public static final String CATEGORY_VALUE_DROPDOWN = "//*[@id='jform_catid_chzn']//*[contains(@class,'active-result')]";
	public static final String STATUS_DROPDOWN = "//*[@id='jform_state_chzn']";
	public static final String STATUS_VALUE_DROPDOWN = "//*[@id='jform_state_chzn']//*[contains(@class,'active-result')]";
	public static final String STATUS_ARCHIVE_DROPDOWN = "//*[@id='filter_published_chzn']";
	public static final String ARCHIVE_VALUE_DROPDOWN = "//*[@id='filter_published_chzn']//*[contains(@class,'active-result')]";
	public static final String ACCESS_DROPDOWN = "//*[@id='jform_access_chzn']";
	public static final String ACCESS_VALUE_DROPDOWN = "//*[@id='jform_access_chzn']//*[contains(@class,'active-result')]";
	public static final String STATUS_FILTER_DROPDOWN = "//*[@id='filter_published_chzn']";
	public static final String STATUS_FILTER_VALUE_DROPDOWN = "//*[@id='filter_published_chzn']//*[contains(@class,'active-result')]";
	public static final String CATEGORY_FILTER_DROPDOWN = "//*[@id='filter_category_id_chzn']";
	public static final String CATEGORY_FILTER_VALUE_DROPDOWN = "//*[@id='filter_category_id_chzn']//*[contains(@class,'active-result')]";
	public static final String ACCESS_FILTER_DROPDOWN = "//*[@id='filter_access_chzn']";
	public static final String ACCESS_VALUE_FILTER_DROPDOWN = "//*[@id='filter_access_chzn']//*[contains(@class,'active-result')]";
	public static final String AUTHOR_FILTER_DROPDOWN = "//*[@id='filter_author_id_chzn']";
	public static final String AUTHOR_VALUE_FILTER_DROPDOWN = "//*[@id='filter_author_id_chzn']//*[contains(@class,'active-result')]";
	public static final String PAGE_DROPDOWN = "//*[@id='list_limit_chzn']";
	public static final String PAGE_VALUE_DROPDOWN = "//*[@id='list_limit_chzn']//*[contains(@class,'active-result')]";
	public static final String ARTICLE_IFRAME = "//iframe[@id='jform_articletext_ifr']";
	public static final String ARTICLE_TEXTAREA = "//*[@id='tinymce']";
	public static final String SAVEANDCLOSE_BTN = "//button[contains(.,'Save & Close')]";
	public static final String SAVED_MSG = "//div[contains(@class,'alert-message')]";
	public static final String ARTICLE_CHCBOX = "//input[@id='cb0']";
	public static final String EDIT_BTN = "//button[contains(.,'Edit')]";
	public static final String PUBLISH_BTN = "//button[contains(.,'Publish')]";
	public static final String UNPUBLISH_BTN = "//button[contains(.,'Unpublish')]";
	public static final String CHECKIN_BTN = "//button[contains(.,'Check-in')]";
	public static final String SEARCHTOOLS_BTN = "//button[contains(.,'Search Tools')]";
	public static final String ARCHIVE_BTN = "//button[contains(.,'Archive')]";
	public static final String ARTICLE_ARCHIVE_LIST = "//*[@id='articleList']";
	public static final String TRASH_BTN = "//button[contains(.,'Trash')]";
	public static final String HELP_MEMU = "//a[contains(.,'Help')]";
	public static final String HELP_lIST = "//*[@class='dropdown open']//*[@class='dropdown-menu scroll-menu']";
	public static final String SEARCH_TXT = "//input[@id='filter_search']";
	public static final String SEARCH_BTN = "//button[@aria-label='Search']";
	public static final String ARROWDOWN_BTN = "//span[@class='icon-arrow-down-3']";
	public static final String TITLE_FILTER_LBL = "//a[contains(.,'Search Article Filter')]";
	public static final String TITLE_FILTER_DROPDOWN_LBL = "//a[contains(.,'Search Article Dropdown')]";
	public static final String SORT_ID_CBX = "//*[@data-order='a.id']";
	public static final String ID_LIST = "//*[@id='articleList']//td[@class='hidden-phone']";
	public static final String ALL_CKCBX = "//*[contains(@id,'cb')]";
	public static final String CLEAR_BTN = "//button[contains(.,'Clear')]";
	public static final String IMAGE_BTN = "//a[@href='#images']";
	public static final String SELECT_IMAGE_BTN = "//*[@id='jform_images_image_intro']/following-sibling::a[contains(text(),'Select')]";
	public static final String POWERBY_IMAGE = "//*[contains(@src,'2.png')]";
	public static final String UPLOAD_BTN = "//input[@id='upload-file']";
	public static final String STARTUPLOAD_BTN = "//button[@id='upload-submit']";
	public static final String INSERT_BTN = "//button[contains(.,'Insert')]";
	public static final String CHILD_IFRAME = "//iframe[@id='imageframe']";
	public static final String PARENT_IFRAME = "//iframe[@name='field-media-modal']";
	public static final String PUBLISH_STATUS_BTN = "//*[@sortable-group-id='8']//*[contains(@onclick,'cb0')]//*[@class='icon-publish']";
	public static final String UNPUBLISH_STATUS_BTN = "//*[@sortable-group-id='8']//*[contains(@onclick,'cb0')]//*[@class='icon-unpublish']";
	public static final String FEATURE_BTN = "//*[@sortable-group-id='8']//*[contains(@onclick,'cb0')]//*[@class='icon-featured']";
	public static final String UNFEATURE_BTN = "//*[@sortable-group-id='8']//*[contains(@onclick,'cb0')]//*[@class='icon-unfeatured']";
}
