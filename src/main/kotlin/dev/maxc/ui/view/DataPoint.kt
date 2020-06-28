package dev.maxc.ui.view


/**
 * @author Max Carter
 * @since 28/06/2020
 */
data class DataPoint(val key: String, val data: String) {
    companion object {
        private const val UNKNOWN_RESPONSE = "N/A"
        private val DUMMY_NODE = DataPoint(
            "key",
            UNKNOWN_RESPONSE
        )

        fun getData(sample: List<DataPoint>, key: String): String {
            for (dp in sample) {
                if (dp.key == key) {
                    return dp.data
                }
            }
            return UNKNOWN_RESPONSE
        }

        fun getDataPoint(sample: List<DataPoint>, key: String): DataPoint {
            for (dp in sample) {
                if (dp.key == key) {
                    return dp
                }
            }
            return DUMMY_NODE
        }
    }
}