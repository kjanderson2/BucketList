package android.kaitlynanderson.com.bucketlist.model

import java.util.*

/**
 * Created by kaitlynanderson on 2/27/18.
 * Data class for a list item
 * Required non-null parameter of title
 * All other parameters are optional and add information about the users goals/priorities
 */
data class ListItem(var title: String, var description: String?, var cost: Double?, var priority: Int?, var deadline: Date?, var notes: String?) {

}