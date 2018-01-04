#!/usr/bin/env groovy

import org.hvbuilders.*

def call(String buildDataFilePath) {
  echo "Loading build data from ${buildDataFilePath}"
  def loader = new LoadBuildData()
  def data = loader.LoadBuildControlData(buildDataFilePath)

  return data
}