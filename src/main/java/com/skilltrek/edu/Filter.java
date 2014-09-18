package com.skilltrek.edu;

import java.io.IOException;

/**
 * Created by ekr on 18.09.14.
 */
public interface Filter {
    Object filter() throws IOException;
}
