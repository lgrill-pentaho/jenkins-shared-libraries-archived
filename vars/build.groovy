import org.hvbuilders.*

def call(buildDataFilePath) {
  echo "Loading build data from ${buildDataFilePath}"
  def loader = new LoadBuildData()
  def data = loader.LoadBuildControlData(buildDataFilePath)

  return data
}