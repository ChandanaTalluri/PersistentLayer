/*
 * Creating RecordNotFoundException when records not found in DB
 */
package exceptions;

/**
 *
 * @author Chandana 
 */
public class RecordNotFoundException extends Exception{
    public RecordNotFoundException(String msg) {
        super(msg);
    }
}

