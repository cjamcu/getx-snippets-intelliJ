import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider

class FlutterTemplateProvider : DefaultLiveTemplatesProvider {
    override fun getDefaultLiveTemplateFiles(): Array<String> {
        return arrayOf("liveTemplates/getx")
    }

    override fun getHiddenLiveTemplateFiles(): Array<String?>? {
        return arrayOfNulls(0)
    }
}