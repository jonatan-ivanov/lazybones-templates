def props = [:]
props.appName = ask("Define value for 'appName' [fatjar-cli]: ", 'fatjar-cli', 'appName')

processTemplates 'build.gradle', props
processTemplates 'settings.gradle', props
processTemplates 'README.md', props

new File("$projectDir/src/main/groovy/app.groovy").renameTo("$projectDir/src/main/groovy/${props.appName}.groovy")

new File("$projectDir/.gitignore").text = '''
.gradle/
build/

out/
.idea/
*.iws
*.ipr
*.iml
'''
