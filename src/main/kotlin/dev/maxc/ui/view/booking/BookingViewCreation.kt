package dev.maxc.ui.view.booking

import dev.maxc.ui.view.creator.PaneScrollerViewCreation
import javafx.scene.layout.Pane


/**
 * @author Max Carter
 * @since 28/06/2020
 */
class BookingViewCreation(parentPane: Pane) : PaneScrollerViewCreation(
    parentPane,
    createView(
        "Client",
        "booking/booking_find_client"
    ),
    createView(
        "Confirm",
        "confirmed",
        skipProgressBarTab = true
    )
)