def props = [:]
props.appName = ask("Define value for 'appName' [nanoservice]: ", 'nanoservice', 'appName')

processTemplates 'config/application.yml', props
processTemplates 'Dockerfile', props
processTemplates 'docker-compose.yml', props
processTemplates 'README.md', props

new File("$projectDir/.gitignore").text = '''
.idea/
*.iws
*.ipr
*.iml

*.jar
*.jar.original
'''
