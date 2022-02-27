package com.directi.training.dip.submission;

import java.io.IOException;

public class EncodingModuleClient
{
    final static String BEFORE_ENCRYPTION_FILE = "DIP/src/com/directi/training/dip/submission/beforeEncryption.txt";
    final static String AFTER_ENCRYPTION_FILE = "DIP/src/com/directi/training/dip/submission/afterEncryption.txt";
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule();

        IReader reader = new MyFileReader(BEFORE_ENCRYPTION_FILE);
        IWriter writer = new MyFileWriter(AFTER_ENCRYPTION_FILE);
        encodingModule.encode(reader, writer);

        reader = new MyNetworkReader("http", "myfirstappwith.appspot.com", "/index.html");
        writer = new MyDatabaseWriter();
        encodingModule.encode(reader, writer);
    }
}
