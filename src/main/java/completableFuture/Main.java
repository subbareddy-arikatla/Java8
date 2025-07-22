package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("arikatla");
        CompletableFuture<Void> demo= CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                try{
                    TimeUnit.SECONDS.sleep(1);
                }catch(InterruptedException e){
                    throw new IllegalStateException(e);
                }
                    System.out.println("ill run in a separate thread than the main thread");

            }
        });
        demo.get();
    }
}
