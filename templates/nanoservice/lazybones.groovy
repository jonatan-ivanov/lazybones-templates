def props = [:]
props.appName = ask("Define value for 'appName' [nanoservice]: ", 'nanoservice', 'appName')

processTemplates 'config/application.properties', props
processTemplates 'Dockerfile', props
processTemplates 'docker-compose.yml', props
processTemplates 'README.md', props
