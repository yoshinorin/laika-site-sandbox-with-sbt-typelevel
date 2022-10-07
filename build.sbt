// publish website from this branch
ThisBuild / tlSitePublishBranch := Some("main")

lazy val docs = project.in(file("site")).enablePlugins(TypelevelSitePlugin)