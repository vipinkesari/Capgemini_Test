package com.myinfosysprogram.roomDb;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0006H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/myinfosysprogram/roomDb/RowsDao;", "", "getAllRows", "", "Lcom/myinfosysprogram/model/response/DBResponse;", "insertRow", "", "rows", "(Lcom/myinfosysprogram/model/response/DBResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nukeTable", "app_debug"})
public abstract interface RowsDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object insertRow(@org.jetbrains.annotations.NotNull()
    com.myinfosysprogram.model.response.DBResponse rows, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from DBResponse")
    public abstract java.util.List<com.myinfosysprogram.model.response.DBResponse> getAllRows();
    
    @androidx.room.Query(value = "DELETE FROM DBResponse")
    public abstract void nukeTable();
}