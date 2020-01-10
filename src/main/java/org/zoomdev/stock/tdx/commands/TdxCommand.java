package org.zoomdev.stock.tdx.commands;

import org.zoomdev.stock.tdx.TdxInputStream;
import org.zoomdev.stock.tdx.TdxOutputStream;

import java.io.IOException;

public interface TdxCommand<R> {
    R process(TdxOutputStream outputStream, TdxInputStream inputStream) throws IOException;
}
