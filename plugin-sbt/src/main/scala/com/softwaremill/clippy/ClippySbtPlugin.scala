package com.softwaremill.clippy

import sbt._

object ClippySbtPlugin extends AutoPlugin {
  override def projectSettings = Seq(
    addCompilerPlugin("com.softwaremill.clippy" %% "plugin" % ClippyBuildInfo.version)
  )

  override def trigger = allRequirements
}