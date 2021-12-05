package 第14章;

public interface ArgumentMarshaler {
      void set(Iterator<String> currentArgument) throws ArgsException;
}

public class BooleanArgumentMarshaler implements ArgumentMarshaler {
      private boolean booleanValue = false;

      public void set(Iterator<String> currentArgument) throws ArgsException {
            booleanValue = true;
      }

      public static boolean getValue(ArgumentMarshaler am) { if (am != null && am instanceof BooleanArgumentMarshaler) return ((BooleanArgumentMarshaler) am).booleanValue; elsereturn false; }
}