import re.hub.commithub.rest.commit.CommitCheckRequest
import re.hub.commithub.ruleScript.annotation.RuleParameter
import re.hub.commithub.ruleScript.annotation.RuleScript
import re.hub.commithub.ruleScript.annotation.RuleParameterValue

@RuleScript(ruleName = "Script from repo edited2", ruleDescription = "Please put a short string here: {{astring}} ")
class DummyRule {

    @RuleParameter(type=RuleParameter.Type.STRING, name="astring", required=false)
    String astring = "defaultvalue"

    boolean check(CommitCheckRequest commitCheckRequest, OutputStream outputCommitMessage) {
        return true;
    }
}