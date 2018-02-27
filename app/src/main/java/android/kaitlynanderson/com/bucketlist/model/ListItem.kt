package android.kaitlynanderson.com.bucketlist.model

import java.util.*

/**
 * Created by kaitlynanderson on 2/27/18.
 */
data class ListItem(var title: String, var description: String, var cost: Double, var priority: Int, var deadline: Date, var notes: String) {
    fun updateTitle()
}