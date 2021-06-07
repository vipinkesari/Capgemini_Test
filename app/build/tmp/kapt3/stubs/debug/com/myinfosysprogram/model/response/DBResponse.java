package com.myinfosysprogram.model.response;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/myinfosysprogram/model/response/DBResponse;", "", "response", "", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "getResponse", "()Ljava/lang/String;", "app_debug"})
public final class DBResponse {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String response = null;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResponse() {
        return null;
    }
    
    public DBResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String response) {
        super();
    }
    
    public DBResponse() {
        super();
    }
}