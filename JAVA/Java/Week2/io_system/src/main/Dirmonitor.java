package main;

import java.io.IOException;

public class Dirmonitor {
    private Path path = null;
    private  WatchService watchService = null;

    private void init(){
        path = Paths.get("c:\\Temp\\temp\\");
        try{
            watchService = FileSystems.getDefault().newWatchService();
            path.register(watchService,ENTRY_CREATE,ENTRY_DELETE,ENTRY_MODIFY);
        }catch (IOException e){
            System.out.println("Exception" + e.getMessage());
        }
    }
}