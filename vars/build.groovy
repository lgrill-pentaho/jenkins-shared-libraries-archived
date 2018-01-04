import org.hvbuilders.*

def call(buildDataFilePath) {
  println "Loading build data from ${buildDataFilePath}"
  def loader = new LoadBuildData()
  def data = loader.LoadBuildControlData(buildDataFilePath)
  data.each{
    println it
  }

  return data
}