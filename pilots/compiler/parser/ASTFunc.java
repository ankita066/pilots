/* Generated By:JJTree: Do not edit this line. ASTFunc.java Version 7.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package pilots.compiler.parser;

public
class ASTFunc extends SimpleNode {
  public ASTFunc(int id) {
    super(id);
  }

  public ASTFunc(PilotsParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(PilotsParserVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=3cd7e2d844dcf75598188dfb0e4f3c0e (do not edit this line) */
