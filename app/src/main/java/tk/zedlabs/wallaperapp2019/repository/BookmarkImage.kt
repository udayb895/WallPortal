package tk.zedlabs.wallaperapp2019.repository

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BookmarkImage(
        @PrimaryKey val imageName : String,
        @ColumnInfo val imageUrlFull : String?,
        @ColumnInfo val imageUrlRegular : String?
    )