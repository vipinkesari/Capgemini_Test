package com.myinfosysprogram.roomDb;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.myinfosysprogram.model.response.DBResponse;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RowsDao_Impl implements RowsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DBResponse> __insertionAdapterOfDBResponse;

  private final SharedSQLiteStatement __preparedStmtOfNukeTable;

  public RowsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDBResponse = new EntityInsertionAdapter<DBResponse>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `DBResponse` (`id`,`response`) VALUES (nullif(?, 0),?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DBResponse value) {
        stmt.bindLong(1, value.getId());
        if (value.getResponse() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getResponse());
        }
      }
    };
    this.__preparedStmtOfNukeTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM DBResponse";
        return _query;
      }
    };
  }

  @Override
  public Object insertRow(final DBResponse rows, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDBResponse.insert(rows);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void nukeTable() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfNukeTable.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfNukeTable.release(_stmt);
    }
  }

  @Override
  public List<DBResponse> getAllRows() {
    final String _sql = "Select * from DBResponse";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfResponse = CursorUtil.getColumnIndexOrThrow(_cursor, "response");
      final List<DBResponse> _result = new ArrayList<DBResponse>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DBResponse _item;
        final String _tmpResponse;
        if (_cursor.isNull(_cursorIndexOfResponse)) {
          _tmpResponse = null;
        } else {
          _tmpResponse = _cursor.getString(_cursorIndexOfResponse);
        }
        _item = new DBResponse(_tmpResponse);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
