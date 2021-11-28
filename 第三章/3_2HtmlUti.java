/*
 * @Author: JackYu
 * @Date: 2021-11-28 16:20:52
 * @LastEditors: JackYu
 * @LastEditTime: 2021-11-28 16:21:20
 * @Description: file content
 */
public class HtmlUtil3_2 {

  public static String renderPageWithSetupsAndTeardowns(
    PageData pageData,
    boolean isSuite
  )
    throws Exception {
    boolean isTestPage = pageData.hasAttribute("Test");
    if (isTestPage) {
      WikiPage testPage = pageData.getWikiPage();
      StringBuffer newPageContent = new StringBuffer();
      includeSetupPages(testPage, newPageContent, isSuite);
      newPageContent.append(pageData.getContent());
      includeTeardownPages(testPage, newPageContent, isSuite);
      pageData.setContent(newPageContent.toString());
    }
    return pageData.getHtml();
  }
}
