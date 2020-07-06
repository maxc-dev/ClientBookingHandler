package dev.maxc.ui.util

import javafx.scene.image.ImageView
import javafx.scene.layout.Pane


/**
 * @author Max Carter
 * @since 06/07/2020
 */

data class PaneButton(val pane: Pane, val imageView: ImageView, var active: Boolean = false)