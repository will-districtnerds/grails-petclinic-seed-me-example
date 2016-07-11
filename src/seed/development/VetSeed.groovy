seed = {

	dependsOn(['SpecialitySeed'])

	vet(
					meta:[key:['firstName', 'lastName']],
					firstName: 'James',
					lastName: 'Carter'
	)

	vet(
					meta:[key:['firstName', 'lastName']],
					firstName: 'Helen',
					lastName: 'Leary',
					specialities:[[meta:[key:'name'], name: 'radiology']]
	)

	vet(
					meta:[key:['firstName', 'lastName']],
					firstName: 'Linda',
					lastName: 'Douglas',
					specialities:[[meta:[key:'name'], name: 'surgery'],
					              [meta:[key:'name'], name: 'dentistry']]
	)

	vet(
					meta:[key:['firstName', 'lastName']],
					firstName: 'Rafael',
					lastName: 'Ortega',
					specialities:[[meta:[key:'name'], name: 'surgery']]
	)

	vet(
					meta:[key:['firstName', 'lastName']],
					firstName: 'Henry',
					lastName: 'Stevens',
					specialities:[[meta:[key:'name'], name: 'radiology']]
	)

	vet(
					meta:[key:['firstName', 'lastName']],
					firstName: 'Sharon',
					lastName: 'Jenkins'
	)

}