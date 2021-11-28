/*
 * @Author: JackYu
 * @Date: 2021-11-28 16:20:52
 * @LastEditors: Please set LastEditors
 * @LastEditTime: 2021-11-28 16:23:50
 * @Description: file content
 */
public class HtmlUtil3_3 {

  public static String renderPageWithSetupsAndTeardowns(
    PageData pageData,
    boolean isSuite
  )
    throws Exception {
    if (isTestPage(pageData)) includeSetupAndTeardownPages(pageData, isSuite);
    return pageData.getHtml();
  }
}
