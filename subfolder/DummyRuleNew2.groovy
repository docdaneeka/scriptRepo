import re.hub.commithub.rest.commit.CommitCheckRequest
import re.hub.commithub.ruleScriptAnnotations.RuleParameter
import re.hub.commithub.ruleScriptAnnotations.RuleScript

@RuleScript(ruleName = "Script from repo2", ruleDescription = "Put a string here: {{astring}}, choose a field: {{field}}, provide an <b>important</b> number: {{anInt}}, check if really important: {{aBoolean}} <br> in new line date here: {{aDate}}, finally statuses: {{statuses}}")
class DummyRuleNew {

    @RuleParameter(type=RuleParameter.Type.STRING, name="astring", required=true)
    String astring = "defaultvalue"

    @RuleParameter(type=RuleParameter.Type.FIELD, name="field", required=true)
    String field = "field"

    @RuleParameter(type=RuleParameter.Type.INT, name="anInt")
    int anInt = 5

    @RuleParameter(type=RuleParameter.Type.BOOL, name="aBoolean")
    boolean aBoolean = true

    @RuleParameter(type=RuleParameter.Type.DATE, name="aDate")
    String aDate = "2018-02-02"

    @RuleParameter(type=RuleParameter.Type.STATUSES, name="statuses")
    long[] statuses

    boolean check(CommitCheckRequest commitCheckRequest, OutputStream outputCommitMessage) {
        String resultMessage = "astring: " + astring
        resultMessage += "\nfield: " + field
        outputCommitMessage.write ( resultMessage.getBytes ( ) )
        return true
    }
}