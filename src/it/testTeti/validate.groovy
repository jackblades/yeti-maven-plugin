try {

def file = new File(basedir, 'target/classes/fb/foo.class')
assert file.exists()

def file2 = new File(basedir, 'target/classes/fb2/foo2.class')
assert file2.exists()

def file3 = new File(basedir, 'target/classes/TestClass.class')
assert file3.exists()

def file4 = new File(basedir, 'target/classes/fb/footeti.class')
assert file4.exists()



return true

} catch(Throwable e) {
  e.printStackTrace()
  return false
}