package dev.maxc.ui.view.booking

import dev.maxc.ui.util.PaneButton
import dev.maxc.ui.util.SelectButtonUtil
import dev.maxc.ui.util.TextFieldUtils
import dev.maxc.ui.view.DataPoint
import dev.maxc.ui.view.ProgressivePane
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.ComboBox
import javafx.scene.control.Label
import javafx.scene.control.TextArea
import javafx.scene.control.TextField
import javafx.scene.image.ImageView
import javafx.scene.layout.Pane
import java.net.URL
import java.util.*


/**
 * @author Max Carter
 * @since 06/06/2020
 */
class BookingSelectRequirements : Initializable, ProgressivePane {
    @FXML
    lateinit var imagePiano: ImageView

    @FXML
    lateinit var imageStage: ImageView

    @FXML
    lateinit var imageGrass: ImageView

    @FXML
    lateinit var imageChoir: ImageView

    @FXML
    lateinit var imageStorage: ImageView

    @FXML
    lateinit var panePiano: Pane

    @FXML
    lateinit var paneStage: Pane

    @FXML
    lateinit var paneGrass: Pane

    @FXML
    lateinit var paneChoir: Pane

    @FXML
    lateinit var paneStorage: Pane

    @FXML
    lateinit var description: TextArea

    @FXML
    lateinit var capacity: TextField

    lateinit var buttonPanes: Array<PaneButton>

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        buttonPanes = arrayOf(
            PaneButton(panePiano, imagePiano),
            PaneButton(paneStage, imageStage),
            PaneButton(paneGrass, imageGrass),
            PaneButton(paneChoir, imageChoir),
            PaneButton(paneStorage, imageStorage)
        )
        for (pane in buttonPanes) {
            SelectButtonUtil.addButtonClickListener(pane)
        }

        TextFieldUtils.addTextFieldValidator(capacity)
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
}