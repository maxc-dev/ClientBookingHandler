package dev.maxc.ui.view


/**
 * @author Max Carter
 * @since 24/06/2020
 */
interface ProgressivePane {
    fun onRequestProgression() : Boolean
    fun onProgressionDenied()
}