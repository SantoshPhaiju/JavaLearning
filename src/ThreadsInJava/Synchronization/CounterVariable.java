package ThreadsInJava.Synchronization;

public class CounterVariable {
        private StringBuffer count = new StringBuffer("S");
//        private String count = new StringBuffer("S");
//        private String count = "Santosh ";


        public void increment() {
            count.append("b");
//            count += "a";
        }

        public  void incrementSynchronized() {
//            count += "b";
        count.append("b");
        }

        public StringBuffer getCount() {
            return count;
        }
}
