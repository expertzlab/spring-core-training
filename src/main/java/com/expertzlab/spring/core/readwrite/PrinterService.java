package com.expertzlab.spring.core.readwrite;

/**
 * Created by gireeshbabu on 31/03/17.
 */
public class PrinterService {

    Reader mReader;
    Writer mWriter;

    public PrinterService(){

    }

    public PrinterService(Reader r, Writer w){
        this.mReader = r;
        this.mWriter = w;
    }

    public String process(){
        return mWriter.write(mReader.read());
    }

    public Reader getmReader() {
        return mReader;
    }

    public void setmReader(Reader mReader) {
        this.mReader = mReader;
    }

    public Writer getmWriter() {
        return mWriter;
    }

    public void setmWriter(Writer mWriter) {
        this.mWriter = mWriter;
    }
}
