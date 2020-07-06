package dev.maxc.ui.view.booking

import dev.maxc.ui.view.PaneScrollerViewCreation
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
        "Venue",
        "booking/booking_create_location"
    ),
    createView(
        "Dates",
        "booking/booking_add_dates"
    ),
    createView(
        "Features",
        "booking/booking_select_requirements"
    ),
    createView(
        "Confirm",
        "confirmed",
        skipProgressBarTab = true
    )
)