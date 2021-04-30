package hospital;

import java.util.LinkedList;

public class Hospital {
  private static   LinkedList  <Object> workerList = new LinkedList <Object>();

    public static LinkedList<Object> getWorkerList() {
        return workerList;
    }
    public void addToList(Workers workers){
        workerList.addFirst(workers);
    }
    public static void Exit(){
        System.exit(0);
    }
    public void getList(){
        for (Object n:workerList ) {
            System.out.println(getWorkerList());
        }
    }

}
