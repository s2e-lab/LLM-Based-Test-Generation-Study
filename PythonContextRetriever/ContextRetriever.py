import ast


def main():
    with open("HasCloseElements.py", "r") as source:
        tree = ast.parse(source.read())

    analyzer = Analyzer()
    analyzer.visit(tree)
    analyzer.report()
    print(ast.dump(tree, indent=4, include_attributes=True))


class Analyzer(ast.NodeVisitor):
    """
    This class is used to analyze the AST tree and report any about any nodes. For example: comment, imports, functions, classes, etc.
    """
    
    def __init__(self):
        self._nodes = []
        self._comments = []
        self._imports = []
        self._functions = []
        self._classes = []
        self._variables = []
    
    def visit(self, node):
        """
        This method is called when a node is visited.
        """
        self._nodes.append(node)
        super().visit(node)
    
    def visit_Comment(self, node):
        """
        This method is called when a comment is visited.
        """
        self._comments.append(node)
    
    def visit_Import(self, node):
        """
        This method is called when an import is visited.
        """
        self._imports.append(node)
    
    def visit_ImportFrom(self, node):
        """
        This method is called when an import from is visited.
        """
        self._imports.append(node)
    
    def visit_FunctionDef(self, node):
        """
        This method is called when a function is visited.
        """
        self._functions.append(node)

    def visit_ClassDef(self, node):
        """
        This method is called when a class is visited.
        """
        self._classes.append(node)
    
    def visit_Assign(self, node):
        """
        This method is called when an assignment is visited.
        """
        self._variables.append(node)

    def report(self):
        """
        This method is used to report the results of the analysis.
        """
        print("Nodes:")
        for node in self._nodes:
            print("  ", node)
        
        print("Comments:")
        for comment in self._comments:
            print("  ", comment)
        
        print("Imports:")
        for import_ in self._imports:
            print("  ", import_.module)
            for name in import_.names:
                print("    ", name.name)
        
        print("Functions:")
        for function in self._functions:
            print("  ", function)
        
        print("Classes:")
        for class_ in self._classes:
            print("  ", class_)
        
        print("Variables:")
        for variable in self._variables:
            print("  ", variable)
if __name__ == "__main__":
    main()