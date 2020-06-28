package dev.maxc.ui.view.creator

import dev.maxc.ui.view.client.ClientConstant


/**
 * @author Max Carter
 * @since 28/06/2020
 */
data class DataPoint(val key: String, val data: String) {
    companion object {
        val DUMMY_NODE = DataPoint("key", ClientConstant.UNKNOWN)

        fun getData(sample: List<DataPoint>, key: String): String {
            for (dp in sample) {
                if (dp.key == key) {
                    return dp.data
                }
            }
            return ClientConstant.UNKNOWN
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