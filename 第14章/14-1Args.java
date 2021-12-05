package 第14章;

/**
 * 14-1Args
 */
public class Args {
      public static void main(String[] args) {
            try {
                  Argsarg = new Args("l,p#,d*", args);
                  boolean logging = arg.getBoolean('l');
                  intport = arg.getInt('p');
                  Stringdirectory = arg.getString('d');
                  executeApplication(logging, port, directory);
            } catch (ArgsException e) {
                  System.out.printf("Argumenterror:%s\n", e.errorMessage());
            }
      }

      if(level+1<tags.length)

      {
            parts = new Parse(body, tags, level + 1, offset + endTag);
            body = null;
      }

      int nextLevel = level + 1;
      if(nextLevel<tags.length)
      {
      }parts=new Parse(body,tags,nextLevel,offset+endTag);
      body=null;
}