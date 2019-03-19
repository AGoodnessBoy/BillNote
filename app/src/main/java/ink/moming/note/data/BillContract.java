package ink.moming.note.data;

import android.net.Uri;
import android.provider.BaseColumns;


public class BillContract {
    public static final String CONTENT_AUTHORITY=
            "ink.moming.note";
    public static final Uri BASE_CONTENT_URI=
            Uri.parse("content://"+CONTENT_AUTHORITY);
    public static final String PATH_BILL="bill";

    public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_BILL)
            .build();

    public static final class BillEntry implements BaseColumns{
        public static final String TABLE_NAME="table_bill";
        public static final String COLUMN_BILL_NAME = "bill_name";//账单名称
        public static final String COLUMN_BILL_COUNT = "bill_count";//总数
        public static final String COLUMN_BILL_REST = "bill_rest";//剩余
        public static final String COLUMN_BILL_DATE = "bill_date";//日期
        public static final String COLUMN_BILL_TYPE = "bill_type";//对应账户
        public static final String COLUMN_BILL_NUMBER = "bill_number";//金额
        public static final String COLUMN_MONTHLY_TAG = "bill_monthly_tag";//每月标记-月初重置
        public static final String COLUMN_RETURN_TAG = "bill_return_tag";//归还标记

        public static Uri buildMovieUriWithId(String COLUMN_BILL_ID){
            return CONTENT_URI.buildUpon()
                    .appendPath(COLUMN_BILL_ID)
                    .build();
        }





    }
}
