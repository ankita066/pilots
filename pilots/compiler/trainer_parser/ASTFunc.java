/* Generated By:JJTree: Do not edit this line. ASTFunc.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package pilots.compiler.trainer_parser;

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
/* JavaCC - OriginalChecksum=55e77f8f086356fb4730bb1e372c521e (do not edit this line) */
