package com.directi.training.dip.submission;

import java.io.IOException;

public interface IWriter
{
    void write(String encodedLine) throws IOException;
}
