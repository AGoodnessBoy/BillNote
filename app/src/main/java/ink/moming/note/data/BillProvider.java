package ink.moming.note.data;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class BillProvider extends ContentProvider {

    public static final int CODE_BILL = 200;
    public static final int CODE_BILL_WITH_ID = 201;

    private static final UriMatcher sUriMatcher = buildUriMatcher();

    private BillDbHelper billDbHelper;

    public static UriMatcher buildUriMatcher(){
        final UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);
        final String authority = BillContract.CONTENT_AUTHORITY;

        matcher.addURI(authority,BillContract.PATH_BILL,CODE_BILL);
        matcher.addURI(authority,BillContract.PATH_BILL+"/#",CODE_BILL_WITH_ID);

        return matcher;
    }
    @Override
    public boolean onCreate() {
        billDbHelper = new BillDbHelper(getContext());
        return true;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }
}
