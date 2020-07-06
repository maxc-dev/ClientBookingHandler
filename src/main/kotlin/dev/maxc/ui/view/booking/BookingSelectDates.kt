package dev.maxc.ui.view.booking

import dev.maxc.ui.view.DataPoint
import dev.maxc.ui.view.ProgressivePane
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.ComboBox
import javafx.scene.control.TextField
import javafx.scene.layout.Pane
import java.net.URL
import java.util.*


/**
 * @author Max Carter
 * @since 06/06/2020
 */
class BookingSelectDates : Initializable, ProgressivePane {
    @FXML
    lateinit var month: ComboBox<String>

    @FXML
    lateinit var date: ComboBox<Int>

    @FXML
    lateinit var year: TextField

    @FXML
    lateinit var startHour: ComboBox<Int>

    @FXML
    lateinit var startMinute: ComboBox<String>

    @FXML
    lateinit var endHour: ComboBox<Int>

    @FXML
    lateinit var endMinute: ComboBox<String>

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        for (x in arrayOf(
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
        )) {
            month.items.add(x)
        }
        for (x in 1..31) {
            date.items.add(x)
        }
        year.text = Calendar.getInstance().get(Calendar.YEAR).toString()

        //add the 24 hours
        for (pane in arrayOf(startHour, endHour)) {
            for (x in 0..23) {
                pane.items.add(x)
            }
        }

        //add 15m increment options
        for (pane in arrayOf(startMinute, startMinute)) {
            for (x in arrayOf("00", "15", "30", "45")) {
                pane.items.add(x)
            }
        }
    }

    override fun onRequestProgression(): Boolean {
        return true
    }

    override fun getDataPoints(): Array<DataPoint> {
        return arrayOf()
    }

    override fun onProgressionDenied() {
    }

    override fun onViewUpdate(dataPoints: List<DataPoint>) {
    }

    @FXML
    fun onDateAdd() {
        //add the date
    }
}