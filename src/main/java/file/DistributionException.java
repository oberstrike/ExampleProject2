package file;

public class DistributionException extends Exception{

    public DistributionException(String filename){
        super("There was an error while distribute the file: " + filename);
    }
}
